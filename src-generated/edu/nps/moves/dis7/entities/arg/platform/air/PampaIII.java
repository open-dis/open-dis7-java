package edu.nps.moves.dis7.entities.arg.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7506e922;
 * Country: Argentina (ARG);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 32595
 */
public class PampaIII extends EntityType
{
    /** Default constructor */
    public PampaIII()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 29147, Attack/Strike
        setSubCategory((byte)2); // uid 32593, IA-63 Pampa
        setSpecific((byte)2); // uid 32595, Pampa III
    }
}
