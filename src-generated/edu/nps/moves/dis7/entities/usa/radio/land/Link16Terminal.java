package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7462ba4b;
 * Country: United States of America (USA);
 * Entity kind: Radio;
 * Domain: LAND;
 *
 * Entity type uid: 26793
 */
public class Link16Terminal extends EntityType
{
    /** Default constructor */
    public Link16Terminal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)21); // uid 26793, Link 16 Terminal
    }
}
