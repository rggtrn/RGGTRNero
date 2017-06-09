//DesiredOutput.kick(\luis, Env.new([0,0,1,1,0,0],[5,0.05,120,1]));

TrainingS{
	*new {arg pathToAudio = "~/path", kickOutput = Env.new([0], [0]), hiHatsOutput = Env.new([0], [0]), snareOutput = Env.new([0], [0]), guiraOutput = Env.new([0], [0]), timbalOutput = Env.new([0], [0]), jamBlockOutput = Env.new([0], [0]), padOutput = Env.new([0], [0]), bassOutput = Env.new([0], [0]);
		 ^super.newCopyArgs(pathToAudio, kickOutput, hiHatsOutput, snareOutput, jamBlockOutput, padOutput, bassOutput);

	}
}
