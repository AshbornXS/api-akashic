package org.registry.akashic.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookPostRequestBody {
    @NotEmpty(message = "The book title cannot be empty")
    @Schema(description = "This is the book's title", example = "Lord of The Rings", required = true)
    @JsonProperty("title")
    private String title;

    @NotEmpty(message = "The book author cannot be empty")
    @Schema(description = "This is the book's author", example = "J.R.R. Tolkien", required = true)
    @JsonProperty("author")
    private String author;

    @NotEmpty(message = "The book description cannot be empty")
    @Schema(description = "This is the book's description", example = "The Lord of the Rings is an epic high-fantasy novel written by English author and scholar J. R. R. Tolkien.", required = true)
    @JsonProperty("description")
    private String description;

    @Schema(description = "This is the book's tags", example = "romance, ficção", required = true)
    @JsonProperty("tags")
    private String tags;

    @Schema(description = "This is the book's cover", required = true)
    @Lob
    @JsonProperty("imageData")
    private byte[] imageData;

    @Schema(description = "This is the book's cover file name", required = true)
    @JsonProperty("imageName")
    private String imageName;

}