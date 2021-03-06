package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12299890;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16402
 */
public class F218MecklenburgVorpommern extends EntityType
{
    /** Default constructor */
    public F218MecklenburgVorpommern()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 16397, Guided Missile Frigate
        setSubCategory((byte)1); // uid 16398, Brandenburg class (Type 123)
        setSpecific((byte)4); // uid 16402, F 218 Mecklenburg-Vorpommern
    }
}
