package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b7683d4;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 14727
 */
public class U200VinnitsaUkraineExDneper extends EntityType
{
    /** Default constructor */
    public U200VinnitsaUkraineExDneper()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 14715, Frigate
        setSubCategory((byte)2); // uid 14717, Grisha II class
        setSpecific((byte)10); // uid 14727, U-200 Vinnitsa (Ukraine) (Ex-Dneper)
    }
}
