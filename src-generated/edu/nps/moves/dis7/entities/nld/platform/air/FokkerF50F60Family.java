package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@76b74e9c;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28194
 */
public class FokkerF50F60Family extends EntityType
{
    /** Default constructor */
    public FokkerF50F60Family()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18933, Cargo/Tanker
        setSubCategory((byte)2); // uid 28194, Fokker F50/F60 Family
    }
}
