package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@258ee7de;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13558
 */
public class Bezuderzhny extends EntityType
{
    /** Default constructor */
    public Bezuderzhny()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 13530, Guided-missile Destroyer
        setSubCategory((byte)2); // uid 13544, Sovremennyy class
        setSpecific((byte)14); // uid 13558, Bezuderzhny
    }
}
