package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5ecddf8f;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24067
 */
public class KingfisherUAV extends EntityType
{
    /** Default constructor */
    public KingfisherUAV()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 24066, Unmanned
        setSubCategory((byte)1); // uid 24067, Kingfisher UAV
    }
}
