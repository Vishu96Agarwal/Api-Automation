package api.payload;

import java.util.List;

public class Faq {

    private String question;
    private String answer;
    private String htmlAnswer;
    private String faqFor;
    private String destinationId;
    private String packageId;
    private String attractionId;
    private String routeBuilderId;
    private String blogId;
    private List<String> faqContexts;
    private boolean isActive;

    // Default Constructor
    public Faq() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getHtmlAnswer() {
        return htmlAnswer;
    }

    public void setHtmlAnswer(String htmlAnswer) {
        this.htmlAnswer = htmlAnswer;
    }

    public String getFaqFor() {
        return faqFor;
    }

    public void setFaqFor(String faqFor) {
        this.faqFor = faqFor;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(String attractionId) {
        this.attractionId = attractionId;
    }

    public String getRouteBuilderId() {
        return routeBuilderId;
    }

    public void setRouteBuilderId(String routeBuilderId) {
        this.routeBuilderId = routeBuilderId;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public List<String> getFaqContexts() {
        return faqContexts;
    }

    public void setFaqContexts(List<String> faqContexts) {
        this.faqContexts = faqContexts;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}