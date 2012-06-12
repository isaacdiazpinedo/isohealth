package test.com.isobar.isohealth;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.isobar.isohealth.GraphConstants;
import com.isobar.isohealth.models.Exercise;
import com.isobar.isohealth.models.Exercise.Set;
import com.isobar.isohealth.models.NewStrengthTrainingActivity;
import com.isobar.isohealth.models.StrengthTrainingActivity;
import com.isobar.isohealth.models.StrengthTrainingActivityFeed;
import com.isobar.isohealth.models.StrengthTrainingActivityFeed.Item;
import com.isobar.isohealth.wrappers.RunkeeperService;
import com.isobar.isohealth.wrappers.StrengthTrainingActivityWrapper;

public class StrengthTrainingActivityServiceTest extends TestCase {

	StrengthTrainingActivityWrapper strengthTrainingActivityWrapper;
	StrengthTrainingActivityFeed strengthTrainingActivityFeed;
	
	protected void setUp() {
    	RunkeeperService runkeeperService = new RunkeeperService(GraphConstants.AUTH_CODE);
    	strengthTrainingActivityWrapper = runkeeperService.strengthTrainingActivityWrapper;
    	try {
    		strengthTrainingActivityFeed = strengthTrainingActivityWrapper.getStrengthTrainingActivityFeed();
    	} catch (Exception e) {
    		e.printStackTrace();
		}
    }
	
	public void testGetStrengthTrainingActivityFeed() {
		try {
			System.out.println("StrengthTrainingActivityFeed: " + strengthTrainingActivityFeed.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testGetStrengthTrainingActivity() {
		try {
			List<StrengthTrainingActivity> strengthTrainingActivities =  new ArrayList<StrengthTrainingActivity>();
			for (Item item : strengthTrainingActivityFeed.getItems()) {
				StrengthTrainingActivity activity = strengthTrainingActivityWrapper.getStrengthTrainingActivity(item.getUri());
				System.out.println("StrengthTrainingActivity: " + activity.toString());
				strengthTrainingActivities.add(activity);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testUpdateStrengthTrainingActivity() {
		try {
			for (Item item : strengthTrainingActivityFeed.getItems()) {
				StrengthTrainingActivity activity = strengthTrainingActivityWrapper.getStrengthTrainingActivity(item.getUri());
				System.out.println("Original activity: " + activity);
				activity.setNotes("Updated Notes");
				strengthTrainingActivityWrapper.updateStrengthTrainingActivity(activity);
				System.out.println("Updated activity: " + activity);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
	
	public void testCreateNewStrengthActivity() {
		try {
		  NewStrengthTrainingActivity activity = new NewStrengthTrainingActivity();
		  activity.setNotes("Quick noon workout");
		  activity.setPost_to_facebook(false);
		  activity.setPost_to_twitter(false);
		  activity.setStart_time("Sat, 1 Jan 2011 12:00:00");
		  Exercise[] exercises =  {new Exercise()};
		  exercises[0].setPrimary_muscle_group("Arms");
		  exercises[0].setPrimary_type("Dumbbell Curl");
		  exercises[0].setSecondary_type("hammer");
		  exercises[0].setRoutine("arms");
		  exercises[0].setNotes("This is the exercise");
		  Set[] sets = {new Set(), new Set()};
		  sets[0].setNotes("Good set");
		  sets[0].setRepetitions(10);
		  sets[0].setWeight(1.8);
		  sets[1].setRepetitions(10);
		  sets[1].setWeight(3.7);
		  exercises[0].setSets(sets);
		  activity.setExercises(exercises);
		  
		  strengthTrainingActivityWrapper.createStrengthTrainingActivity(activity);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testDeleteStrengthTrainingActivity() {
		try {
			for (Item item : strengthTrainingActivityFeed.getItems()) {
				StrengthTrainingActivity activity = strengthTrainingActivityWrapper.getStrengthTrainingActivity(item.getUri());
				strengthTrainingActivityWrapper.deleteStrengthTrainingActivity(activity.getUri());
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
