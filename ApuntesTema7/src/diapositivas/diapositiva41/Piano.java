package diapositivas.diapositiva41;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Piano extends Instrumento {

	@Override
	public void interpretar() {
		System.out.println("Interpretación en piano: ");
		for(Nota n : this.getMelodia()) {
			interpretarNota(n);
		}
		
	}
	
	public static void interpretarNota(Nota nota) {
        int midiNote = 0;

        // Asignar el valor MIDI correspondiente a cada nota
        switch (nota) {
            case DO:
                midiNote = 60; // DO central (C4)
                break;
            case RE:
                midiNote = 62; // RE (D4)
                break;
            case MI:
                midiNote = 64; // MI (E4)
                break;
            case FA:
                midiNote = 65; // FA (F4)
                break;
            case SOL:
                midiNote = 67; // SOL (G4)
                break;
            case LA:
                midiNote = 69; // LA (A4)
                break;
            case SI:
                midiNote = 71; // SI (B4)
                break;
            default:
                System.out.println("Nota no reconocida");
                return;
        }

        // Reproducir la nota
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();

            // Reproducir la nota en el canal 0 (piano)
            channels[0].noteOn(midiNote, 93); // 93 es la velocidad (volumen)
            Thread.sleep(500); // Mantener la nota durante 500 ms
            channels[0].noteOff(midiNote); // Apagar la nota

            synth.close();
        } catch (MidiUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
