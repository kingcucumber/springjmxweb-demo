package com.demo.spring.entity;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "test:name=BeanMonitor", description = "My Managed Bean", log = true, logFile = "jmx.log", currencyTimeLimit = 15, persistPolicy = "OnUpdate", persistPeriod = 200, persistLocation = "foo", persistName = "bar")
public class BeanMonitor {
	public long startTime = 0;
	public long endTime = 0;
	public long durationTime = 0;

	@ManagedAttribute(description="The startTime Attribute", currencyTimeLimit=1)
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	@ManagedAttribute(description="The endTime Attribute", currencyTimeLimit=1)
	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	@ManagedAttribute(description="The durationTime Attribute", currencyTimeLimit=1)
	public long getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(long durationTime) {
		this.durationTime = durationTime;
	}

}
