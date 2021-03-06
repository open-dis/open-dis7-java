package edu.nps.moves.dis7.entities.pak.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@8dfe921;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29199
 */
public class PACMFI395SuperMushshak extends EntityType
{
    /** Default constructor */
    public PACMFI395SuperMushshak()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 29197, Trainer
        setSubCategory((byte)2); // uid 29199, PAC MFI-395 Super Mushshak
    }
}
