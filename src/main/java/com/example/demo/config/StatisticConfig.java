package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 统计模块配置
 * @author
 *
 */

@Component
@ConfigurationProperties(prefix = "statisticcfg")
public class StatisticConfig {
	private String statisticIpAndPort;

	public String getStatisticIpAndPort() {
		return statisticIpAndPort;
	}

	public void setStatisticIpAndPort(String statisticIpAndPort) {
		this.statisticIpAndPort = statisticIpAndPort;
	}
	
}
