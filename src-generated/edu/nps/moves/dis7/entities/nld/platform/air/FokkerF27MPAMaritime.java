package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22c01ab0;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28193
 */
public class FokkerF27MPAMaritime extends EntityType
{
    /** Default constructor */
    public FokkerF27MPAMaritime()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18933, Cargo/Tanker
        setSubCategory((byte)1); // uid 18934, Fokker F27 Friendship
        setSpecific((byte)2); // uid 28193, Fokker F27 MPA Maritime
    }
}
