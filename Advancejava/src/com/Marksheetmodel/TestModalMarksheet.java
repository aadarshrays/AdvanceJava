package com.Marksheetmodel;

public class TestModalMarksheet {
	public static void main(String[] args) throws Exception {
		// TestAdd();
		// testUpdate();
//		testDelete();
		// testGet();
		 testGetMeritList();
		// testSearch();
		// testlist();
	

	}

//	public static void TestAdd() throws Exception {
//		MarksheetBean bean = new MarksheetBean();
//        
//		bean.setRollno("1321");
//		bean.setName("Achal");
//		bean.setPhysics(61);
//		bean.setChemistry(65);
//		bean.setMaths(57);
//		MarksheetModal ml = new MarksheetModal();
//		ml.ADD(bean);
//
//	}
//
//	public static void testUpdate() throws Exception {
//		MarksheetBean bean = new MarksheetBean();
//		bean.setId(6);
//		bean.setRollno("1314");
//		MarksheetModal ml = new MarksheetModal();
//		ml.update(bean);
//	}
//
//	public static void testDelete() throws Exception {
//		MarksheetBean bean = new MarksheetBean();
//		bean.setRollno("1321");
//		MarksheetModal ml = new MarksheetModal();
//		ml.delete(bean);
//	}
//
//	public static void testGet() throws Exception {
//		MarksheetBean bean = new MarksheetBean();
//		bean.setRollno("1202");
//		MarksheetModal ml = new MarksheetModal();
//		ml.get(bean);
//	}
//
	public static void testGetMeritList() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		
		MarksheetModal ml = new MarksheetModal();
		ml.getMeritList();
	}
//
//	public static void testSearch() throws Exception {
//		MarksheetBean bean = new MarksheetBean();
//		bean.setName("Ram");
//
//		MarksheetModal ml = new MarksheetModal();
//		ml.search(bean);
//	}
//
//	public static void testlist() throws Exception {
//		MarksheetModal ml = new MarksheetModal();
//		ml.list();

	

}
