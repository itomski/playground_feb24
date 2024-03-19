package de.lubowiecki.playground.exceptions;

import java.time.LocalDate;
import java.util.Objects;

public class Info {

    private String content;
    private LocalDate createdAt;

    public Info(String content, LocalDate createdAt) {
        this.content = content;
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(content, info.content) && Objects.equals(createdAt, info.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, createdAt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("content='").append(content).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append('}');
        return sb.toString();
    }
}
