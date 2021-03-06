package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d269ed7;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30875
 */
public class GenericLiferaftIBAInflatableBuoyantApparatus extends EntityType
{
    /** Default constructor */
    public GenericLiferaftIBAInflatableBuoyantApparatus()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)2); // uid 30872, Generic Liferaft
        setSpecific((byte)3); // uid 30875, Generic Liferaft IBA (Inflatable Buoyant Apparatus)
    }
}
