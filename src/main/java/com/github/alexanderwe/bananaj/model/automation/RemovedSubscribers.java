package com.github.alexanderwe.bananaj.model.automation;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class RemovedSubscribers extends Subscriber {

	private String workflowId;
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	private int totalItems;
	
	public RemovedSubscribers(JSONObject jsonObj) {
		super(jsonObj);
		this.workflowId = jsonObj.getString("workflow_id"); 
		this.totalItems = jsonObj.getInt("workflow_id");
		if(jsonObj.has("subscribers")) {
			JSONArray list = jsonObj.getJSONArray("subscribers");
			for(int i=0; i<list.length(); i++) {
				JSONObject subscriberJson = list.getJSONObject(i);
				subscribers.add(new Subscriber(subscriberJson));
			}
		}
	}

	public RemovedSubscribers() {

	}

	/**
	 * A string that uniquely identifies an Automation workflow
	 * @return
	 */
	public String getWorkflowId() {
		return workflowId;
	}

	/**
	 * An array of objects, each representing a subscriber who was removed from an Automation workflow
	 * @return
	 */
	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	/**
	 * The total number of items matching the query regardless of pagination
	 * @return
	 */
	public int getTotalItems() {
		return totalItems;
	}
	
}
