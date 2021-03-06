package edu.nps.moves.dis7.entities.dnk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@35d019a3;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24137
 */
public class EH101Merlin extends EntityType
{
    /** Default constructor */
    public EH101Merlin()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 24136, Utility Helicopter
        setSubCategory((byte)1); // uid 24137, EH101 Merlin
    }
}
