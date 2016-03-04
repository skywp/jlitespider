package Main;

import java.util.List;
/**
 * author : Yixin Luo
 * 2016/3/3
 * 
 * 下载器，其中download函数应当返回获取到的html页面字符串的链表
 * 
 * **/
public class Downloader {
	private UrlList urlList;
	
	public Downloader(UrlList u) {
		this.urlList = u;
	}
	/**
	 * 使用UrlList对象中的url，开始下载
	 * **/
	public List<String> download() {
		return Network.create().setUrlList(this.urlList.getUrlList())
				.begin().toStringList();
	}
}