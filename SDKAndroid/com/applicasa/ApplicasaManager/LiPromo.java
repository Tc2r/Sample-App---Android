package com.applicasa.ApplicasaManager;

import java.util.List;

import applicasa.LiCore.LiErrorHandler;
import applicasa.LiCore.promotion.sessions.LiEventManager;
import applicasa.LiCore.promotion.sessions.LiPromotionCallback;

import com.applicasa.Promotion.LiPromotionManager;
import com.applicasa.Promotion.Promotion;

public class LiPromo {

	/**
	 * Sets the promotion callback
	 * @param liPromotionCallback
	 */
	public static void setPromoCallback(LiPromotionCallback liPromotionCallback)
	{
		LiEventManager.setPromoCallback(liPromotionCallback);
	}
	
	/**
	 * 
	 * @return the available promotions
	 */
	public static List<Promotion> getAvailablePromotions()
	{
		return LiPromotionManager.getAvailablePromotions();
	}
	
	/**
	 * 
	 * @return the available promotions
	 * @throws LiErrorHandler 
	 */
	public static void refreshPromotions() throws LiErrorHandler
	{
		LiPromotionManager.getPromotions();
	}
	
	
	
}
