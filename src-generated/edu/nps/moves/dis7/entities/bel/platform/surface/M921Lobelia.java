package edu.nps.moves.dis7.entities.bel.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50f8360d;
 * Country: Belgium (BEL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23317
 */
public class M921Lobelia extends EntityType
{
    /** Default constructor */
    public M921Lobelia()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23312, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23313, Flower class
        setSpecific((byte)4); // uid 23317, M921 Lobelia
    }
}
