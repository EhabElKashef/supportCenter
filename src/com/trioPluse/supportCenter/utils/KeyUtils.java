package com.trioPluse.supportCenter.utils;

import java.util.Random;
import java.util.UUID;

public class KeyUtils {
	public static String generateActivationKey() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
}
