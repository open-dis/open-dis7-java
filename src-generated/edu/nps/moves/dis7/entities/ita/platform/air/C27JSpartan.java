package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d0d6318;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 22923
 */
public class C27JSpartan extends EntityType
{
    /** Default constructor */
    public C27JSpartan()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18311, Cargo/Tanker
        setSubCategory((byte)1); // uid 18312, G.222/C-27 Spartan
        setSpecific((byte)3); // uid 22923, C-27J Spartan
    }
}
