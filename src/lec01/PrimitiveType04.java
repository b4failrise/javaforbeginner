package lec01;

public class PrimitiveType04 {
	public static void main(String[] args) {
		boolean isTrue = false;
		char onChar = '가';
		char twoChar = '나';
		
//		byte firstByte 		= 1;
//		short secondShort	= 2;
//		int thirdInt		= 3;
//		long forthLong		= 4;
//		System.out.println(forthLong);
		
		float floatA1 = 10.1f;
		double doubleB1 = 20.2;
		double dfAB1 = floatA1 + doubleB1;
		System.out.println(dfAB1);
		
		int accountDocumentCount = 10;
		int humanResourceDocumentCount = 20;
		int procureDocuementCount =5;
		int productionDocumentCount = 15;
		int salesDocumentCount = 25;
		
		int totalDailyDocumentCount = accountDocumentCount + humanResourceDocumentCount + procureDocuementCount + productionDocumentCount + salesDocumentCount;
		System.out.println(totalDailyDocumentCount);
	
		
	}
}
