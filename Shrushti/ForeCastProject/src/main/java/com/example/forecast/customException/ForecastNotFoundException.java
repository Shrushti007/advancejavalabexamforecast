package com.example.forecast.customException;

	@SuppressWarnings("serial")
	public class ForecastNotFoundException extends RuntimeException {
		public ForecastNotFoundException (String msg) {
			super(msg);
		}
	}

