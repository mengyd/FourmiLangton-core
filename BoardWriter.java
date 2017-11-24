package fourmilangton.core;

import java.nio.file.Path;

public interface BoardWriter {
	void write(int[][] board, Path image);
}
