package pl.sda.poznan.factory.enumexample;

import pl.sda.poznan.factory.JsonPersonFileReader;
import pl.sda.poznan.factory.PersonFileReader;
import pl.sda.poznan.factory.TxtPersonFileReader;
import pl.sda.poznan.factory.XmlPersonFileReader;

public class EnumPersonReaderFactory {

    PersonFileReader create(PersonReaderFileType fileType) {
        switch (fileType) {
            case TXT:
                return new TxtPersonFileReader();
            case XML:
                return new XmlPersonFileReader();
            case JSON:
                return new JsonPersonFileReader();

        }
        return null;
    }
}
