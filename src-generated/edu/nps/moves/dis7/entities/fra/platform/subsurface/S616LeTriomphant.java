package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d1bf319;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 16176
 */
public class S616LeTriomphant extends EntityType
{
    /** Default constructor */
    public S616LeTriomphant()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 16174, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)1); // uid 16175, Le Triomphant class (SNLE-NG)
        setSpecific((byte)1); // uid 16176, S 616 Le Triomphant
    }
}
