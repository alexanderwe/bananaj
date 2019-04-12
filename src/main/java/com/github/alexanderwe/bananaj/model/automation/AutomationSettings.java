package com.github.alexanderwe.bananaj.model.automation;

import org.json.JSONObject;

public class AutomationSettings {

	private String title;
	private String fromName;
	private String replyTo;
	private boolean useConversation;
	private String toName;
	private boolean authenticate;
	private boolean autoFooter;
	private boolean inlineCss;
		
	public AutomationSettings() {

	}

	public AutomationSettings(JSONObject settings) {
		this.title = settings.getString("title");
		this.fromName = settings.getString("from_name");
		this.replyTo = settings.getString("reply_to");
		this.useConversation = settings.getBoolean("use_conversation");
		this.toName = settings.getString("to_name");
		this.authenticate = settings.getBoolean("authenticate");
		this.autoFooter = settings.getBoolean("auto_footer");
		this.inlineCss = settings.getBoolean("inline_css");
	}

	/**
	 * The title of the Automation
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * The title of the Automation
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * The ‘from’ name for the Automation (not an email address)
	 * @return
	 */
	public String getFromName() {
		return fromName;
	}

	/**
	 * The ‘from’ name for the Automation (not an email address)
	 * @param fromName
	 */
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	/**
	 * The reply-to email address for the Automation
	 * @return
	 */
	public String getReplyTo() {
		return replyTo;
	}

	/**
	 * The reply-to email address for the Automation
	 * @param replyTo
	 */
	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	/**
	 * Whether to use Mailchimp’s Conversations feature to manage out-of-office replies
	 * @return
	 */
	public boolean isUseConversation() {
		return useConversation;
	}

	/**
	 * The Automation’s custom ‘To’ name, typically the first name merge field
	 * @return
	 */
	public String getToName() {
		return toName;
	}

	/**
	 * Whether Mailchimp authenticated the Automation. Defaults to true
	 * @return
	 */
	public boolean isAuthenticate() {
		return authenticate;
	}

	/**
	 * Whether to automatically append Mailchimp’s default footer to the Automation
	 * @return
	 */
	public boolean isAutoFooter() {
		return autoFooter;
	}

	/**
	 * Whether to automatically inline the CSS included with the Automation content
	 * @return
	 */
	public boolean isInlineCss() {
		return inlineCss;
	}

}
