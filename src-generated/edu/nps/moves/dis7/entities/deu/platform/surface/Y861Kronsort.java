package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31add175;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16706
 */
public class Y861Kronsort extends EntityType
{
    /** Default constructor */
    public Y861Kronsort()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 16684, Utility
        setSubCategory((byte)6); // uid 16704, Schwedeneck class (type 748, multipurpose)
        setSpecific((byte)2); // uid 16706, Y 861 Kronsort
    }
}
