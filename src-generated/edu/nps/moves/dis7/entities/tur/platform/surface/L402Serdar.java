package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10b1a751;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23279
 */
public class L402Serdar extends EntityType
{
    /** Default constructor */
    public L402Serdar()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 23276, Tank Landing Ship
        setSubCategory((byte)1); // uid 23277, Ertugrul class
        setSpecific((byte)2); // uid 23279, L402 Serdar
    }
}
