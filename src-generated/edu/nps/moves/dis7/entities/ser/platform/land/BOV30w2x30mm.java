package edu.nps.moves.dis7.entities.ser.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@20de05e5;
 * Country: Serbia and Montenegro;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23673
 */
public class BOV30w2x30mm extends EntityType
{
    /** Default constructor */
    public BOV30w2x30mm()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 23670, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 23671, Self -Propelled VSHORAD Gun / Missile System
        setSpecific((byte)2); // uid 23673, BOV-30 w/ 2 x 30-mm
    }
}
