package homework;
import java.util.Scanner;
import java.io.*;
import java.security.MessageDigest;
import java.io.FileInputStream;
public class Hash {
	public static void main(String[] args) {
		try {	
			System.out.println("请按格式输入文件夹目录");
			Scanner input = new Scanner(System.in);
			String target = input.next();
			input.close();
			
			byte[] sha1 = dfs(target);
		
			String result = "";
			for(int i = 0; i < sha1.length; i++) {
				result += Integer.toString(sha1[i]&0xFF, 16);
			}

			System.out.println("该目录的哈希值为" + result); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    
	public static MessageDigest SHA1Checksum(InputStream is , MessageDigest Oldcomplete) throws Exception{
		//用于计算hash值的文件缓冲区
		byte[] buffer = new byte[1024];
		//使用SHA1哈希/摘要算法
		MessageDigest complete = Oldcomplete;
		int numRead = 0;
		do {
			// 读出numRead字节
			numRead = is.read(buffer);
			if(numRead > 0) {
				//根据buffer[0:numRead]的内容更新hash值
				complete.update(buffer,0,numRead);
			}
			//文件读完，退出循环
		}while(numRead != -1);
		//关闭输入流
		is.close();
		//返回哈希值
		return complete;  
	}
	
	//文件夹的深度优先遍历
    public static byte[] dfs(String path) throws Exception {
    	File dir = new File(path);
    	File[] fs = dir.listFiles();
    	

    	MessageDigest complete1 = MessageDigest.getInstance("SHA-1");
    	for(int i = 0; i < fs.length; i++) {
    		if (fs[i].isFile()){

    			FileInputStream fi = new FileInputStream(fs[i]);
    			complete1 = SHA1Checksum(fi,complete1);   		
    			System.out.println("file" + fs[i].getName() + "遍历成功");
    		}
    		
    		if(fs[i].isDirectory()) {
    			System.out.println("directory" + fs[i].getName() + "遍历成功");
    			dfs(path + File.separator + fs[i].getName());
    		}
    	}
    	System.out.println("文件目录遍历成功");
		return complete1.digest();
    }
     
}
