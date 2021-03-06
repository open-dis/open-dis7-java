package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@45d84a20;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16167
 */
public class F749EnseignedeVaisseauHenry extends EntityType
{
    /** Default constructor */
    public F749EnseignedeVaisseauHenry()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)2); // uid 16164, Commandant Riviere class (Avisos Escorteurs)
        setSpecific((byte)3); // uid 16167, F 749 Enseigne de Vaisseau Henry
    }
}
