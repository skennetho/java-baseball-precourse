package baseball;

public class Target {
	private String targetNumber;

	private int rangeBegin = 1;
	private int rangeEnd = 9;
	private int length = 3;

	public void generateTargetNumber() {
		//TODO: target
	}

	public int[] compareWith(int userNumber) {
		int[] ballsAndStrikes = new int[2];
		// TODO: 비교기능
		return ballsAndStrikes;
	}

	public int getRangeBegin() {
		return this.rangeBegin;
	}

	public void setRangeBegin(int rangeBegin) {
		this.rangeBegin = rangeBegin;
	}

	public int getRangeEnd() {
		return this.rangeEnd;
	}

	public void setRangeEnd(int rangeEnd) {
		this.rangeEnd = rangeEnd;
	}
}
