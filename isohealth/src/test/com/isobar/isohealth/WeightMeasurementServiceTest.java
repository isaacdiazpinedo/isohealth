package test.com.isobar.isohealth;

import java.util.ArrayList;
import java.util.List;

import com.isobar.isohealth.GraphConstants;
import com.isobar.isohealth.models.NewWeightMeasurement;
import com.isobar.isohealth.models.WeightMeasurement;
import com.isobar.isohealth.models.WeightMeasurementFeed;
import com.isobar.isohealth.models.WeightMeasurementFeed.Item;
import com.isobar.isohealth.services.WeightMeasurementService;

public class WeightMeasurementServiceTest {
	public void testWeightMeasurementFeed() {
		try {
			WeightMeasurementFeed weightMeasurementFeed = WeightMeasurementService.getWeightMeasurementFeed(GraphConstants.AUTH_CODE);
			System.out.println("WeightMeasurementFeed: " + weightMeasurementFeed.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testWeightMeasurement() {
		try {
			WeightMeasurementFeed weightMeasurementFeed = WeightMeasurementService.getWeightMeasurementFeed(GraphConstants.AUTH_CODE);
			List<WeightMeasurement> weightMeasurementList =  new ArrayList<WeightMeasurement>();
			for (Item item : weightMeasurementFeed.getItems()) {
				WeightMeasurement weightMeasurement = WeightMeasurementService.getWeightMeasurement(item.getUri(),GraphConstants.AUTH_CODE);
				System.out.println("SleepMeasurement: " + weightMeasurement.toString());
				weightMeasurementList.add(weightMeasurement);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testUpdateWeightMeasurement() {
		try {
			WeightMeasurementFeed weightMeasurementFeed = WeightMeasurementService.getWeightMeasurementFeed(GraphConstants.AUTH_CODE);
			for (Item item : weightMeasurementFeed.getItems()) {
				WeightMeasurement weightMeasurement = WeightMeasurementService.getWeightMeasurement(item.getUri(),GraphConstants.AUTH_CODE);
				weightMeasurement.setWeight(80.0);
				weightMeasurement.setTimestamp("Wed, 5 Jan 2011 07:03:00");
				WeightMeasurement updatedWeightMeasurement = WeightMeasurementService.updateWeightMeasurement(weightMeasurement, GraphConstants.AUTH_CODE);
				System.out.println("Updated SleepMeasurement: " + updatedWeightMeasurement);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
	
	public void testCreateNewWeightMeasurement() {
		try {
			NewWeightMeasurement weightMeasurement = new NewWeightMeasurement();
			weightMeasurement.setWeight(80.0);
			weightMeasurement.setTimestamp("Wed, 5 Jan 2011 07:03:00");
		  
			WeightMeasurementService.createWeightMeasurement(weightMeasurement, GraphConstants.AUTH_CODE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
