package ex10_single.Inheritance;

public class TVCR extends TV {
	VCR vcr = new VCR();

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	}

	void rew() {
		vcr.rew();
	}

	void ff() {
		vcr.ff();
	}
}
