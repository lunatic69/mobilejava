package java1116;

public class HowLong {
	public int howMany(int ty, int tm, int td, int dy, int bm, int bd){
		int tot = 0;
		YGCalender yg = new YGCalender();
		int ttot = yg.totalDay(ty, tm, td);
		int btot = yg.totalDay(dy, bm, bd);
		tot = ttot - btot;
		return tot;
	}
	public static void main(String[] args) {
		HowLong hl = new HowLong();
		int tot = hl.howMany(2015, 11, 16, 1991, 1, 16);
		System.out.println(tot);
	}
}
