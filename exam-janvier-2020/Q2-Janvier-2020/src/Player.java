import java.util.ArrayList;
import java.util.List;

public class Player {

	private enum State {
		LOCKED {
			@Override
			public String onPlay(Player player) {
				player.setState(State.READY);
				return "Ready";
			}

			@Override
			public String onLock(Player player) {
				return "Locked...";
			}
		},
		PLAYING {
			@Override
			public String onPlay(Player player) {
				player.setState(State.READY);
				return "Paused...";
			}

			@Override
			public String onLock(Player player) {
				player.setState(State.LOCKED);
				player.setCurrentTrackAfterStop();
				return "Stop playing";
			}

			@Override
			public String onNext(Player player) {
				return player.nextTrack();
			}

			@Override
			public String onPrevious(Player player) {
				return player.previousTrack();
			}
		},
		READY {
			@Override
			public String onPlay(Player player) {
				String action = player.startPlayback();
				player.setState(State.PLAYING);
				return action;
			}

			@Override
			public String onLock(Player player) {
				player.setState(State.LOCKED);
				return "Locked...";
			}
		};

		public String onPlay(Player player) {
			throw new RuntimeException();
		}

		public String onLock(Player player) {
			throw new RuntimeException();
		}

		public String onNext(Player player) {
			return "Locked...";
		}

		public String onPrevious(Player player) {
			return "Locked...";
		}
	}

  private State state;
  private List<String> playlist = new ArrayList<>();
  private int currentTrack = 0;

  public Player() {
		setState(State.READY);

    for (int i = 1; i <= 12; i++) {
      playlist.add("Track " + i);
    }
  }

  public void setState(State state) {
    this.state = state;
  }

  public String startPlayback() {
    return "Playing " + playlist.get(currentTrack);
  }

  public String nextTrack() {
    currentTrack++;
    if (currentTrack > playlist.size() - 1) {
      currentTrack = 0;
    }
    return "Playing " + playlist.get(currentTrack);
  }

  public String previousTrack() {
    currentTrack--;
    if (currentTrack < 0) {
      currentTrack = playlist.size() - 1;
    }
    return "Playing " + playlist.get(currentTrack);
  }

  public void setCurrentTrackAfterStop() {
    this.currentTrack = 0;
  }

  public String onPlay() {
    return this.state.onPlay(this);
  }

  public String onLock() {
		return this.state.onLock(this);
  }

  public String onNext() {
		return this.state.onNext(this);
  }

  public String onPrevious() {
		return this.state.onPrevious(this);
  }
}
