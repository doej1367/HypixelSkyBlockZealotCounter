package main;

import java.util.Comparator;

public class ZealotCount implements Comparator<ZealotCount> {
	private Long timestamp;
	private Long zealotKillCount;

	public ZealotCount(Long timestamp, Long zealotKillCount) {
		super();
		this.timestamp = timestamp;
		this.zealotKillCount = zealotKillCount;
	}

	@Override
	public int compare(ZealotCount arg0, ZealotCount arg1) {
		return (int) Math.signum(arg0.getTimestamp() - arg1.getTimestamp());
	}

	public long getTimestamp() {
		return timestamp;
	}

	public long getZealotKillCount() {
		return zealotKillCount;
	}

}
