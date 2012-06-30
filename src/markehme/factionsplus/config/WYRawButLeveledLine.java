package markehme.factionsplus.config;

import markehme.factionsplus.extras.*;


public class WYRawButLeveledLine extends WYItem {
	private String fullLine;
	
	/**
	 * if input was:<br>
	 * "     something"<br>
	 * and our level is<br>
	 * "  ^"<br>
	 * then the line would be:<br>
	 * __"   something"  (without the __  that's used to aligning)<br>
	 * in other words, the level (leading spaces representing level are stripped)<br> 
	 * @param _entireLine
	 * @param parent
	 * @param prev
	 */
	public WYRawButLeveledLine(int lineNumber, String alreadyLeveledLine , WYSection parent, WYItem prev) {
		super(lineNumber,parent,prev);
		fullLine=alreadyLeveledLine;
		assert Q.nn( fullLine );
	}

	public String getRawButLeveledLine() {
		return fullLine;
	}
	
	@Override
	public String toString() {
		return getRawButLeveledLine();
	}
}
