import java.util.*;
public class Generic4Test {

	public static void main(String[] args) {
		List<Map<String,Object>> list = new ArrayList<>();	//map 형식의 key가 String , value가 Object
				
		Map<String,Object> hm = new HashMap<String,Object>();
		hm.put("name","홍길동");
		hm.put("id","hong");
		hm.put("age", 30);
	
		list.add(hm);	
		
		hm = new HashMap<String,Object>();
		hm.put("name","이순신");
		hm.put("id","Lee");
		hm.put("age", 40);
	
		list.add(hm);	
		
		hm = new HashMap<String,Object>();
		hm.put("name","김유신");
		hm.put("id","Kim");
		hm.put("age", 50);
	
		list.add(hm);
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).get("name")+", "
					+list.get(i).get("id")+", " +list.get(i).get("age"));
		}
		
	}
	

}
