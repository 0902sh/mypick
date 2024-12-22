package com.mega.boardnew.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mega.boardnew.bean.AttachFileVO;

import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnailator;

@Controller
@Slf4j
@RequestMapping("/upload/*")
public class UploadController {
	
	@GetMapping("uploadForm")
	public void uploadForm() {
		log.info("[UploadController] uploadForm() called");
	}
	
	@PostMapping("uploadFormAction")
	public String upload(MultipartFile[] uploadFile, Model model) {
		String uploadPath = "C:/upload/temp";
		

		
		for(MultipartFile f : uploadFile) {
			log.info("filename : " + f.getOriginalFilename());
			log.info("filesize : " + f.getSize());
			
			// UUID 적용
			// Network 상에서 각각의 개체를 식별하기 위해 사용
			String uploadFileName = f.getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			uploadFileName = uuid.toString() + "_" + uploadFileName;
			
			// File Creation(Empty)
			// File saveFile = new File(uploadFolder, f.getOriginalFilename());
			File saveFile = new File(uploadPath, uploadFileName);
			
			// Contents Copy
			try {
			f.transferTo(saveFile);
			}
			catch(Exception e) { e.printStackTrace(); }
		}
		
		return "/upload/result";
	}
	
	@GetMapping("uploadAjax")
	public void uploadAjax() {
		log.info("[UploadController] uploadForm() called");
	}
	
	@PostMapping(value ="uploadAjaxAction", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody // 메서드 종료 시 html로 가지 않고 데이터로 리턴
	public List uploadAjaxPost(MultipartFile[] uploadFile, Model model) {
		log.info("[uploadController] uploadAjaxAction() called ok");
		
		List<AttachFileVO> fileList = new ArrayList();
		
		String uploadFolder = "C:/upload/temp";
		String uploadFolderPath = getFolder();
		
		// yyyy/mm/dd 경로 만들기
		File uploadPath = new File(uploadFolder, getFolder());
		
		if(uploadPath.exists()) { // 디렉토리가 존재하는가?
			log.info("directory already exists");
		}
		else {
			uploadPath.mkdirs();
		}
		
		for(MultipartFile f : uploadFile) {
			log.info("filename : " + f.getOriginalFilename());
			log.info("fileszie : " + f.getSize());
			
			AttachFileVO attachFileVO = new AttachFileVO();
			
			// UUID 적용
			// Network 상에서 각각의 개체를 식별하기 위해 사용
			String uploadFileName = f.getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			uploadFileName = uuid.toString() + "_" + uploadFileName;
			attachFileVO.setFileName(uploadFileName);
			attachFileVO.setUuid(uuid.toString());
			attachFileVO.setUploadPath(uploadFolderPath);
			
			// File Creation(Empty)
			// File saveFile = new File(uploadFolder, f.getOriginalFilename());
			File saveFile = new File(uploadPath, uploadFileName);
			
			// Contents Copy
			try {
				f.transferTo(saveFile);
				
				if(checkImageType(saveFile)) {
					log.info("----------------> Image File");
					attachFileVO.setImage(true);
					
					FileOutputStream thumbnail = new FileOutputStream(
							new File(uploadPath, "s_" + uploadFileName));
					
					InputStream in = new FileInputStream(saveFile);
					Thumbnailator.createThumbnail(in, thumbnail, 100, 100);
					thumbnail.close();
					in.close();
					
				}
				else {
					log.info("----------------> Not Image File");
				}
			}	
			catch(Exception e) { e.printStackTrace(); }
			
			fileList.add(attachFileVO);
		}
			
		return fileList;
	}
	
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String str = sdf.format(date);
		
		return str;
	}
	
	private boolean checkImageType(File file) {
		try {
			String contentType = Files.probeContentType(file.toPath());
			log.info("---------------> contentType : " + contentType);
			return contentType.startsWith("image");
		}
		catch(Exception e) { e.printStackTrace(); }
		
		return false;
	}
	@GetMapping(value="download", produces=MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody // 결과가 페이지 이동이 아닌, 데이터 제공
	public ResponseEntity<Resource> downloadFile(String fileName){
		log.info("download file : " + fileName);
		Resource resource = new FileSystemResource("C:/upload/temp/" + fileName);
		String resourceName = resource.getFilename();
		HttpHeaders headers = new HttpHeaders();
		
		try {
			headers.add("Content-Disposition",
					    "attachment; filename=" +
						new String(resourceName.getBytes("UTF-8"), "ISO-8859-1"));
		}
		catch(Exception e) { e.printStackTrace(); }
		
		return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
		// C:/upload/temp에 아무 파일이나 넣고 /upload/download?fileName=파일명
	}
	
	@GetMapping("display") // <img src="localhost:10001/upload/display?fileName=***">
	@ResponseBody
	public ResponseEntity<byte[]> getFile(String fileName) {
		log.info("file name : " + fileName);
		
		ResponseEntity<byte[]> result = null;
		HttpHeaders header = new HttpHeaders();
		File file = new File("C:/upload/temp/" + fileName);
		
		try {
			// 헤더에 적절한 파일 타입을 probeContentType을 통해 포함시킴
			// 예) png 파일이면 image/png, jpeg 파일이면 image/jpeg 타입
			header.add("Content-Type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(file),
												header, HttpStatus.OK);
		}
		catch(Exception e) { e.printStackTrace(); }
		
		return result;
	}
}
