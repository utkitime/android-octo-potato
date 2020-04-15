package ru.utkitime.practice.jsonconvertation;

public class TestObject {
    private String title;
    private int lessonNumber;
    private boolean isDone;

    public TestObject (String title, int lessonNumber, boolean isDone) {
        this.title = title;
        this.lessonNumber = lessonNumber;
        this.isDone = isDone;
    }

    public String getTitle() {
        return title;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public boolean isDone() {
        return isDone;
    }
}
