package test.com.isobar.isohealth;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.isobar.isohealth.GraphConstants;
import com.isobar.isohealth.models.BackgroundActivity;
import com.isobar.isohealth.models.BackgroundActivityFeed;
import com.isobar.isohealth.models.BackgroundActivityFeed.Item;
import com.isobar.isohealth.services.BackgroundActivityService;

public class BackgroundActivityServiceTest extends TestCase {

	public void testGetBackgroundActivityFeed() {
		try {
			BackgroundActivityFeed backgroundActivityFeed = BackgroundActivityService.getBackgroundActivityFeed(GraphConstants.AUTH_CODE);
			System.out.println("BackgroundActivityFeed: " + backgroundActivityFeed.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testGetBackgroundActivity() {
		try {
			BackgroundActivityFeed backgroundActivityFeed = BackgroundActivityService.getBackgroundActivityFeed(GraphConstants.AUTH_CODE);
			List<BackgroundActivity> backgroundActivities =  new ArrayList<BackgroundActivity>();
			for (Item item : backgroundActivityFeed.getItems()) {
				BackgroundActivity activity = BackgroundActivityService.getBackgroundActivity(item.getUri(),GraphConstants.AUTH_CODE);
				System.out.println("BackgroundActivity: " + activity.toString());
				backgroundActivities.add(activity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public void testCreateNewBackgroundActivity() {
//		try {
//		  NewBackgroundActivity activity = new NewBackgroundActivity();
//		  activity.setSteps(1000d);
//		  activity.setTimestamp("Wed, 5 Jan 2011 07:03:00");  
//		  
//		  BackgroundActivityService.createBackgroundActivity(activity, GraphConstants.AUTH_CODE);
//		  
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void testUpdateBackgroundActivity() {
		try {
			BackgroundActivityFeed backgroundActivityFeed = BackgroundActivityService.getBackgroundActivityFeed(GraphConstants.AUTH_CODE);
			for (Item item : backgroundActivityFeed.getItems()) {
				BackgroundActivity activity = BackgroundActivityService.getBackgroundActivity(item.getUri(),GraphConstants.AUTH_CODE);
				System.out.println("Activity: " + activity);
				activity.setSteps(1200d);
				activity = BackgroundActivityService.updateBackgroundActivity(activity, GraphConstants.AUTH_CODE);
				System.out.println("Updated activity: " + activity);
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
}
