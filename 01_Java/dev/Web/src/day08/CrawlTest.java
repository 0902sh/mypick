package day08;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlTest extends JFrame implements ActionListener {
	JLabel[] label;
	JButton bt;
	
	CrawlTest() {
		bt = new JButton("GET!!");
		bt.setBounds(20, 20, 340, 30);
		bt.addActionListener(this);
		add(bt);
		
		label = new JLabel[10];
		for(int i=0; i<10; i++) {
			label[i] = new JLabel("Ranking " + (i+1));
			label[i].setBounds(20, 80 + (40*i), 340, 30);
			add(label[i]);
		}
		
		setSize(400, 600);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrawlTest ct = new CrawlTest();
	}
	// 가수이름도 넣어보기 과제
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked!");
		// System.out.println(e.getSource());  // 이벤트가 발생한 소스
		
		String URL = "https://music.bugs.co.kr/chart";
		Font font = new Font("나눔고딕", Font.PLAIN, 14);
		
		try {
			Document doc = Jsoup.connect(URL).get();
			System.out.println(doc);
			Elements elem = doc.select("p.title"); // p.title = p태그 중 클래스가 title인 것
			System.out.println(elem);
			
			int count = 0;
			
			for(Element el : elem) {
				String text = label[count].getText();
				label[count].setText(text + " - " + el.text());
				label[count].setFont(font);
				if(count == 9) break;
				count++;
			}
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}

}
