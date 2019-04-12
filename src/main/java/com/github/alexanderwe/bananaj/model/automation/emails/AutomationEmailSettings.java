package com.github.alexanderwe.bananaj.model.automation.emails;

import org.json.JSONObject;

public class AutomationEmailSettings {
	String	subjectLine;	// Campaign Subject Line	
	String	previewText;	// Campaign Preview Text	
	String	title;	// Campaign Title	
	String	fromName;	// From Name	
	String	replyTo;	// Reply To Address	
	boolean	authenticate;	// Authentication	
	boolean	autoFooter;	// Auto-Footer	
	boolean	inlineCss;	// Inline CSS	
	boolean	autoTweet;	// Auto-Tweet	
	// List<String> autoFbPost;	// Auto Post to Facebook	
	boolean	fbComments;	// Facebook Comments	
	int	templateId;	// Template ID	
	boolean	dragAndDrop;	// Drag And Drop Campaign	

	public AutomationEmailSettings(JSONObject jsonObj) {
		this.subjectLine = jsonObj.getString("subject_line");
		this.previewText = jsonObj.getString("preview_text");
		this.title = jsonObj.getString("title");
		this.fromName = jsonObj.getString("from_name");
		this.replyTo = jsonObj.getString("reply_to");
		this.authenticate = jsonObj.getBoolean("authenticate");
		this.autoFooter = jsonObj.getBoolean("auto_footer");
		this.inlineCss = jsonObj.getBoolean("inline_css");
		this.autoTweet = jsonObj.getBoolean("auto_tweet");
		//this.autoFbPost = jsonObj.getJSONArray("auto_fb_post");
		this.fbComments = jsonObj.getBoolean("fb_comments");
		this.templateId = jsonObj.getInt("template_id");
		this.dragAndDrop = jsonObj.getBoolean("drag_and_drop");
	}

	public AutomationEmailSettings() {

	}

	/**
	 * The subject line for the campaign
	 * @return
	 */
	public String getSubjectLine() {
		return subjectLine;
	}

	/**
	 * The preview text for the campaign
	 * @return
	 */
	public String getPreviewText() {
		return previewText;
	}

	/**
	 * The title of the campaign
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * The ‘from’ name on the campaign (not an email address)
	 * @return
	 */
	public String getFromName() {
		return fromName;
	}

	/**
	 * The reply-to email address for the campaign
	 * @return
	 */
	public String getReplyTo() {
		return replyTo;
	}

	/**
	 * Whether Mailchimp authenticated the campaign. Defaults to true.
	 * @return
	 */
	public boolean isAuthenticate() {
		return authenticate;
	}

	/**
	 * Automatically append Mailchimp’s default footer to the campaign
	 * @return
	 */
	public boolean isAutoFooter() {
		return autoFooter;
	}

	/**
	 * Automatically inline the CSS included with the campaign content
	 * @return
	 */
	public boolean isInlineCss() {
		return inlineCss;
	}

	/**
	 * Automatically tweet a link to the campaign archive page when the campaign is sent
	 * @return
	 */
	public boolean isAutoTweet() {
		return autoTweet;
	}

	/**
	 * Allows Facebook comments on the campaign (also force-enables the Campaign Archive toolbar). Defaults to true.
	 * @return
	 */
	public boolean isFbComments() {
		return fbComments;
	}

	/**
	 * The id for the template used in this campaign
	 * @return
	 */
	public int getTemplateId() {
		return templateId;
	}

	/**
	 * Whether the campaign uses the drag-and-drop editor
	 * @return
	 */
	public boolean isDragAndDrop() {
		return dragAndDrop;
	}

}
