package main;

import java.util.ArrayList;

public class Profile {
	private String uuid;
	private String cute_name;
	private ArrayList<ZealotCount> zealotKillCounts = new ArrayList<>();

	public Profile(String uuid, String cute_name) {
		this.uuid = uuid;
		this.cute_name = cute_name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCute_name() {
		return cute_name;
	}

	public void setCute_name(String cute_name) {
		this.cute_name = cute_name;
	}

	public ArrayList<ZealotCount> getZealotKillCounts() {
		return zealotKillCounts;
	}

	public void addZealotKillCount(Long timestamp, Long zealotKillCount) {
		zealotKillCounts.add(0, new ZealotCount(timestamp, zealotKillCount));
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Profile))
			return false;
		return getUuid().equalsIgnoreCase(((Profile) o).getUuid());
	}
}
