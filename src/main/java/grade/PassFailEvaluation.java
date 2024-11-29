package grade;

public class PassFailEvaluation implements IGradeEvaluation {

	@Override
	public String getGrade(int point) {
		if (point >= 70)
			return "P";
		else
			return "F";
	}
}
