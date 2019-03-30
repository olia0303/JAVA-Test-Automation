package mailRu.helpers.parser;

public class Arguments {
	private String recipients;
	private String subject;

	public String getRecipients() {
		return recipients;
	}

	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Arguments:" + "recipients=" + recipients + "subject=" + subject;
	}
}
