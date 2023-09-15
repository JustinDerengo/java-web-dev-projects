import java.util.List;
import java.util.ArrayList;

class Comment {
    String text;
    List<Comment> replies;

    public Comment(String text) {
        this.text = text;
        this.replies = new ArrayList<>();
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    public void display(int indentLevel) {
        // Indent the comment based on the indentLevel
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < indentLevel; i++) {
            indent.append("  "); // Two spaces per level, adjust as needed
        }

        System.out.println(indent.toString() + text);

        // Display replies with increased indent level
        for (Comment reply : replies) {
            reply.display(indentLevel + 1);
        }
    }
}

public class CommentRecursion {
    public static void main(String[] args) {
        Comment firstComment = new Comment("I love Java");
        Comment firstReply = new Comment("Me too!");
        Comment secondReply = new Comment("The coffee or the computer language?");
        Comment subReply = new Comment("Me Three!");

        firstComment.addReply(firstReply);
        firstComment.addReply(secondReply);
        firstReply.addReply(subReply);

        // Display the comments with proper indentation
        firstComment.display(0);
    }
}
