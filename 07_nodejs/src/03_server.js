var http = require("http");
var fs = require("fs");
var url = require("url");

// Create Server
http.createServer(function(request, response){
    console.log(request.url);
    
    // URL 뒤에 있는 디렉토리/파일명 해석
    var pathName = url.parse(request.url).pathname;

    // root로 접속 시 index.html로 세팅
    if(pathName == '/'){
        pathName = '/index.html';
    }

    fs.readFile(pathName.substr(1), function(err, data){
        if(err){
            console.log(err);
            // Page Not Found(404)
            response.writeHead(404, {'Content-Type': 'text/html'});
        }
        else {
            // Page Found(200)
            response.writeHead(200, {'Content-Type': 'text/html'});

            // File을 읽어서 Body에 기술
            response.write(data.toString());
        }

        response.end();
    });

}).listen(10002);

console.log("\033[94m" + "나 안놀아 일하는 중" + "\033[0m");