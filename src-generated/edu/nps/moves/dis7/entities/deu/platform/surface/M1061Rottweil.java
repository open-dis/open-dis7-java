package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cdba6dc;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16525
 */
public class M1061Rottweil extends EntityType
{
    /** Default constructor */
    public M1061Rottweil()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 16484, Mine Countermeasure Ship / Craft
        setSubCategory((byte)6); // uid 16523, Frankenthal Class (Type 332 Minehunters, Coastal)
        setSpecific((byte)2); // uid 16525, M 1061 Rottweil
    }
}
